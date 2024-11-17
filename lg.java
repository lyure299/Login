const btnSignin = document.querySelector("#signin");
const btnSignup = document.querySelector("#signup");
const body = document.querySelector("body");

btnSignin.addEventListener("click", () => {
  body.className = "sign-in-js";
});

btnSignup.addEventListener("click", () => {
  body.className = "sign-up-js";
});