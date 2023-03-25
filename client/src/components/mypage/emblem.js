import React from "react";
import Image from "next/image";
import { useEffect, useState } from "react";

const Badge = (reward) => {
    return (
        <>
            <h1>{reward}</h1>
            <Image src={"../assets/images/emblem.gif"} />
        </>
    );
};

export default Badge;
