import React, { useEffect, useRef, useState } from "react";
import * as ReactDOM from "react-dom";
import styled from "styled-components";
import CloseIcon from "../assets/icons/close.svg";

const Modal = ({ show, onClose, children, title }) => {
    const [isBrowser, setIsBrowser] = useState(false);

    useEffect(() => {
        setIsBrowser(true);
    }, []);

    const handleCloseClick = (e) => {
        e.preventDefault();
        onClose();
    };

    // const router = useRouter();

    // const { startDate, endDate } = router.query;
    // console.log(router.query);

    // const formattedStartDate = format(new Date(startDate), "dd MMMM yy");
    // const formattedEndDate = format(new Date(endDate), "dd MMMM yy");
    // const range = `${formattedStartDate} - ${formattedEndDate}`;

    const modalContent = show ? (
        <StyledModalOverlay>
            <StyledModal>
                <StyledModalHeader>
                    <a href="#" onClick={handleCloseClick}>
                        <CloseIcon className="w-12 h-12" />
                    </a>
                </StyledModalHeader>

                {title && <StyledModalTitle>{title}</StyledModalTitle>}
                <StyledModalBody>{children}</StyledModalBody>
                {/* {range} */}
            </StyledModal>
        </StyledModalOverlay>
    ) : null;

    if (isBrowser) {
        return ReactDOM.createPortal(
            modalContent,
            document.getElementById("portal")
        );
    } else {
        return null;
    }
};

const StyledModalBody = styled.div`
    padding-top: 1px;
`;

const StyledModalHeader = styled.div`
    display: flex;
    justify-content: flex-end;
    font-size: 25px;
`;

const StyledModal = styled.div`
    background: white;
    width: 1200px;
    height: 800px;
    border-radius: 30px;
    border-color: #b241c5;
    border-width: 2px;
    padding: 15px;
`;

const StyledModalOverlay = styled.div`
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: rgba(0, 0, 0, 0.5);
`;

const StyledModalTitle = styled.div`
    font-size: 30px;
`;

export default Modal;
