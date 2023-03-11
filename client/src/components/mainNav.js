/*
	px - x축 패딩3
*/
const MainNav = ({ feature }) => {
    return (
        <button className="flex-grow items-center bg-white-100 border-2 border-fuchsia-500 px-4 rounded">
            {feature}

            {/* 
			<svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" className="w-4 h-4 ml-1" viewBox="0 0 24 24">
				<path d="M5 12h14M12 5l7 7-7 7"></path>
			</svg>
			*/}
        </button>
    );
};

export default MainNav;
