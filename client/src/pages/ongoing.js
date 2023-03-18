import Head from "next/head";
import Layout from "../components/layout";
import OnGoing_nav_menu_bar from "../components/onGoing_nav_menu_bar";

export default function OnGoing() {
    return (
        <Layout>
            <Head>
                <title>Goal For You Web!!</title>
                <meta
                    name="description"
                    content="Generated by create next app"
                />
                <meta
                    name="viewport"
                    content="width=device-width, initial-scale=1"
                />
                <link rel="icon" href="/favicon.ico" />
            </Head>

            <div className="mt-3 mb-1">
                <OnGoing_nav_menu_bar />
            </div>

            <div className="ml-10 mr-10 frame">
                <div>Ongoing Goals</div>
            </div>
        </Layout>
    );
}
