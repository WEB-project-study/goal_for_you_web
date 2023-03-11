import { useRouter } from "next/router";
export default function Custom500() {
    const router = useRouter();
    setTimeout(() => {
        //500을 확인하면 3초 뒤 root 페이지로 이동
        router.push("/");
    }, 3000);
    return (
        <>
            <h1>500 ERROR: 내부 서버 오류</h1>
            <h3>3초 후 메인 페이지로 돌아갑니다.</h3>
        </>
    );
}
