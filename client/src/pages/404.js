import { useRouter } from "next/router";

export default function Custom404() {
    const router = useRouter();
    setTimeout(() => {
        //404를 확인하면 3초 뒤 root 페이지로 이동
        router.push("/");
    }, 3000);
    return (
        <>
            <h1>404 ERROR: 페이지가 존재하지 않습니다.</h1>
            <h3>3초 후 메인 페이지로 돌아갑니다.</h3>
        </>
    );
}
