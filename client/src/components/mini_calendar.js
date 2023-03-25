import React, { useState } from "react";
// import "react-datetime/css/react-datetime.css"

import "react-date-range/dist/styles.css"; // main style file
import "react-date-range/dist/theme/default.css"; // theme css file
import { DateRange } from "react-date-range";
import { addDays } from "date-fns";
import ko from "date-fns/locale/ko"; // 날짜 포맷 라이브러리 (한국어 기능 임포트)
import moment from "moment";
import { useRouter } from "next/router";
import Modal from "../components/Modal";

export default function Mini_calendar() {
    // const
    const [startDate, setStartDate] = useState(new Date());
    const [endDate, setEndDate] = useState(new Date());
    const router = useRouter();

    const dateChoice = (e) => {
        router.push({
            pathname: "/add-goal", // 왠지 데이터를 보낼 다른 방법이 있을 것 같다 찾아보자!!
            query: {
                startDate: startDate.toISOString(),
                endDate: endDate.toISOString(),
            },
        });
        // e.preventDefault();
        // onclose();
    };

    const handleSelect = (ranges) => {
        setStartDate(ranges.selection.startDate);
        setEndDate(ranges.selection.endDate);
    };

    const selectionRange = {
        startDate: startDate,
        endDate: endDate,
        key: "selection",
    };

    return (
        <div className="flex flex-col align-center">
            <div className="flex flex-col col-span-3 mx-auto border-2 shawdow-inner border-fuchsia-300 rounded-xl">
                <DateRange
                    ranges={[selectionRange]}
                    minDate={addDays(new Date(), -300)}
                    dateDisplayFormat="yy-MM-dd"
                    rangeColors={["#E560C8"]}
                    onChange={handleSelect}
                />
            </div>
            <div className="mt-5 ml-20">
                <button onClick={dateChoice} className="Choice_btn">
                    <h4>Choice</h4>
                </button>
            </div>
        </div>
    );
}
