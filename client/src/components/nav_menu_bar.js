import Link from "next/link";

export default function Nav_menu_bar() {
    return (
        <div>
            <nav className="flex flex-wrap items-center justify-center p-2 text-base font-bold font_local md:ml-auto">
                    <Link legacyBehavior href="/calendar">
                        <a>
                            <span className="nav_menu_bar">
                                Calendar
                            </span>
                        </a>
                    </Link>
                    <Link legacyBehavior href="/ongoing">
                        <a>
                            <span className="nav_menu_bar">
                                On Going
                            </span>
                        </a>
                    </Link>
                    <Link legacyBehavior href="/community">
                        <a>
                            <span className="nav_menu_bar">
                                Community
                            </span>
                        </a>
                    </Link>
                    <Link legacyBehavior href="/mypage">
                        <a>
                            <span className="nav_menu_bar">
                                My Page
                            </span>
                        </a>
                    </Link>

                </nav>
        </div>
    )
}