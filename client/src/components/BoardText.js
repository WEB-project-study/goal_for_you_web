const board_text = ({ setTitle, setContent, title, content }) => {
    return (
        <div className="textarea-wrapper">
            <input
                onChange={(e) => {
                    setTitle(e.target.value);
                }}
                className="mt-1 mb-1"
                // className="text_title"
                placeholder="제목 입력하기"
                value={title}
            />
            <textarea
                className="mt-1 w-90 h-80"
                // className="text_content"
                onChange={(e) => setContent(e.target.value)}
                value={content}
                placeholder="내용 입력하세요"
            />
        </div>
    );
};

export default board_text;
