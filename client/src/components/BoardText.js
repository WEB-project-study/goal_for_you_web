
const board_text = ({setTitle, setContent, title, content}) => {
    return (
        <div className="textarea-wrapper">
            <input
                onChange={(e) =>{
                    setTitle(e.target.value);
                }}
                className="text_title"
                placeholder="제목 입력하기"
                value={title}
            />
            <textarea
                className="text_content"
                onChange={(e) => setContent(e.target.value)}
                value={content}
                placeholder="내용 입력하세요"
            />
        </div>
    );
};

export default board_text;