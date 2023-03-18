import Link from "next/link";
// import OnGoing from "@/pages/ongoing";
// import MyPage from "@/pages/mypage";
import Nav_menu_bar from "../components/nav_menu_bar";
// import Top_logo from "../../public/assets/logo.svg";

export default function Header() {
    return (
        <div>
            <header className="text-gray-600 body-font">
                <div className="container flex flex-col flex-wrap items-center p-5 mx-auto md:flex-row">
                    <Link legacyBehavior href="/">
                        <a>{/* <Top_logo className="w-14 h-14" /> */}</a>
                    </Link>
                    <Link legacyBehavior href="/">
                        <a>
                            <span className="ml-3 text-xl font_local">
                                Goal For You
                            </span>
                        </a>
                    </Link>
                    <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
                        <div className="p-1">
                            <Link legacyBehavior href="/ongoing">
                                <a className="inline-flex items-center px-3 py-1 mt-4 text-white bg-purple-500 border-0 rounded-xl focus:outline-none hover:bg-purple-300 hover:text-purple-700 hover: md:mt-0">
                                    Add Goal
                                </a>
                            </Link>
                        </div>
                        <div className="p-1">
                            <Link legacyBehavior href="/mypage">
                                <a className="inline-flex items-center px-3 py-1 mt-4 text-white bg-purple-500 border-0 rounded-xl focus:outline-none hover:bg-purple-300 hover:text-purple-700 hover: md:mt-0">
                                    Logout
                                </a>
                            </Link>
                        </div>
                    </nav>
                </div>
                <hr className="border border-purple-500" />
                <Nav_menu_bar />
            </header>
        </div>
    );
}
