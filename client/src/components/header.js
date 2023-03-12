import MainNav from "./mainNav";
/*
		tailwindcss

        ml, mr, mt, mb: margin + left, right, top, bottom
        mx-auto, my-auto: x축, y축끼리 거리유지 
		items-center: 안에 들어있는 요소 가운데 정렬
        반응형 설계 관련: https://tailwindcss.com/docs/responsive-design
        hover: 마우스 갖다놓으면 이벤트

        //NOTE: flex
        flex: 내용물의 width만큼만 배치한다 default로 수평 방향으로 나열
        flex-row: 수평정렬
        flex-col: 수직 정렬
        flex-wrap: 공간이 좁아질 때 줄바꿈



	*/
const Header = () => {
    return (
        <header className="flex-col mx-auto">
            <div className="p-5">
                <div className="flex">
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
                    <nav className="ml-auto flex items-center text-base justify-center">
                        <a className="mr-5 hover:text-gray-900">Add Goal</a>
                        <a className="mr-5 hover:text-gray-900">Logout</a>
                    </nav>
                </div>
            </div>
            <div className="p-5 items-center">
                <div className="flex flex-col md:flex-row">
                    <MainNav feature="Calendar" />
                    <MainNav feature="On Going" />
                    <MainNav feature="Community" />
                    <MainNav feature="My Page" />
                </div>
            </div>
        </header>
    );
};

export default Header;
