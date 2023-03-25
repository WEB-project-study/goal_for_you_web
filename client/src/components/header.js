import Link from "next/link";
import Nav_menu_bar from "./nav_menu_bar";
import Top_logo from "../assets/logo.svg";
import React, { useState } from "react";
import Modal from "./Modal";
import AddGoal from "../pages/add-goal";
import { useRouter } from "next/router"; // 헤더에 새롭게 추가 홈 라우터
import Login from "./login";

export default function Header() {
    const [showModal, setShowModal] = useState(false);
    const router = useRouter;
    return (
        <div>
            <header className="text-gray-600 body-font">
                <div className="container flex flex-col flex-wrap items-center p-5 mx-auto md:flex-row">
                    <div
                        className="cursor-pointer"
                        onClick={() => router.push("/")}
                    >
                        <Top_logo className="w-14 h-14" />
                    </div>
                    <div
                        className="cursor-pointer"
                        onClick={() => router.push("/")}
                    >
                        <span className="ml-3 text-xl font_local">
                            Goal For You Private
                        </span>
                    </div>
                    <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
                        {/* <div >
                            <button onClick={() => setShowModal(true)}
                            className="header_right_btn"
                            >Add Goal</button>
                            <Modal
                                onClose={() => setShowModal(false)}
                                show={showModal}
                            >
                                <AddGoal />
                            </Modal>
                        </div> */}
                        <div className="p-1">
                            <Link legacyBehavior href="/add-goal">
                                <a className="header_right_btn">Add Goal</a>
                            </Link>
                        </div>
                        <div className="p-1">
                            <Login />
                            {/* <Link legacyBehavior href="/mypage">
                                <a className="inline-flex items-center px-3 py-1 mt-4 text-white bg-purple-500 border-0 rounded-xl focus:outline-none hover:bg-purple-300 hover:text-purple-700 hover: md:mt-0">
                                    Logout
                                </a>
                            </Link> */}
                        </div>
                    </nav>
                </div>
                <hr className="border border-purple-500" />
                <Nav_menu_bar />
            </header>
        </div>
    );
}
