import MainNav from "./mainNav";
/*
		tailwindcss

        ml, mr, mt, mb: margin + left, right, top, bottom
        mx-auto, my-auto: x축, y축끼리 거리유지 
		items-center: 안에 들어있는 요소 가운데 정렬
        반응형 설계 관련: https://tailwindcss.com/docs/responsive-design


	*/
export default function Header() {
    return (
        <header className="container mx-auto body-font">
            <div className="container mx-auto flex flex-wrap p-5 md:flex-row items-center">
                <a className="flex title-font font-medium items-center text-gray-900">
                    <svg
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        stroke="currentColor"
                        strokeLinecap="round"
                        strokeLinejoin="round"
                        strokWwidth="2"
                        className="w-10 h-10 text-white p-2 bg-indigo-500 rounded-full"
                        viewBox="0 0 24 24"
                    >
                        <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
                    </svg>
                    <span className="ml-3 text-xl">Goal For You!</span>
                </a>
                <nav className="md:ml-auto flex flex-wrap items-center text-base justify-center">
                    <a className="mr-5 hover:text-gray-900">Add Goal</a>
                    <a className="mr-5 hover:text-gray-900">Logout</a>
                </nav>
            </div>
            <div className="container bg-black-100 mx-auto p-5 items-center md:flex">
                <MainNav feature="Calendar" />
                <MainNav feature="Calendar" />
                <MainNav feature="Calendar" />
                <MainNav feature="Calendar" />
            </div>
        </header>
    );
}
