import Link from "next/link";

export default function OnGoing_nav_menu_bar() {
    return (
        <nav className="flex flex-wrap items-center justify-center text-base font-bold font_local md:ml-auto">
            <Link legacyBehavior href="/ongoing">
                <a>
                    <span className="nav_menu_bar">On Going</span>
                </a>
            </Link>
            <Link legacyBehavior href="/ongoing-completed">
                <a>
                    <span className="nav_menu_bar">Completed</span>
                </a>
            </Link>
        </nav>
    );
}
