import React from "react";

const BtnMyPage = (props, link) => {
    return (
        <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
            <div className="p-1">
                <button className="inline-flex items-center px-3 py-1 mt-4 text-white bg-purple-500 border-0 rounded-xl focus:outline-none hover:bg-sky-300 hover:text-black hover: md:mt-0">
                    Hello
                </button>
            </div>
        </nav>
    );
};

export default BtnMyPage;
