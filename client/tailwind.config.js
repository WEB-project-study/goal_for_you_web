/** @type {import('tailwindcss').Config} */
module.exports = {
    content: [
        ".app/**/*.{js,ts,jsx,tsx}",
        "./pages/**/*.{js,ts,jsx,tsx}",
        "./components/**/*.{js,ts,jsx,tsx}",

        // Or if using `src` directory:
        "./src/**/*.{js,ts,jsx,tsx}",
    ],
    darkMode: "class",
    theme: {
        extend: {},
    },
    plugins: [],

    // theme: {
    //   colors: {
    //     'ordinary-purple': '#B241C5',
    //     'light-purple': '#EABFFF',
    //     'deep-pink' : '#E560C8',
    //   },
    // },
};
