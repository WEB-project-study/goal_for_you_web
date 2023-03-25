import React, { useState } from "react";

export default function Tags_bar({ tag_name }) {
    const [selectTag, setSelectTag] = useState(false);

    const clickTagBtn = () => {
        setSelectTag(!selectTag);
    };
    return (
        <div className="container flex flex-col flex-wrap mx-auto cursor-pointer md:flex-row active:scale-95">
            <button
                onClick={clickTagBtn}
                className={selectTag ? "click_tag_btn" : "tags_btn"}
            >
                {tag_name}
            </button>
        </div>
    );
}
