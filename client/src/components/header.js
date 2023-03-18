import Link from "next/link";
// import OnGoing from "@/pages/ongoing";
// import MyPage from "@/pages/mypage";
import Nav_menu_bar from "../components/nav_menu_bar";
import Top_logo from "../../public/assets/images/logo.svg";
import Login from "./login";
import React, { useState } from "react";
import Modal from '../components/modal';
import AddGoal from '../components/add-goal';

export default function Header() {
    const [showModal, setShowModal] = useState(false);
    return (
        <div>
            <header className="text-gray-600 body-font">
                <div className="container flex flex-col flex-wrap items-center p-5 mx-auto md:flex-row">
                    <Link legacyBehavior href="/">
                        <a>
                            <Top_logo className="w-14 h-14" />
                        </a>
                    </Link>
                    <Link legacyBehavior href="/">
                        <a>
                            <span className="ml-3 text-xl font_local">
                                Goal For You
                            </span>
                        </a>
                    </Link>
                    <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
                        <div >
                            <button onClick={() => setShowModal(true)}
                            className="inline-flex items-center px-3 py-1 mt-4 text-white bg-purple-500 border-0 rounded-xl focus:outline-none hover:bg-purple-300 hover:text-purple-700 hover: md:mt-0"
                            >Add Goal</button>
                            <Modal
                                onClose={() => setShowModal(false)}
                                show={showModal}
                            >
                                <AddGoal />
                            </Modal>
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
