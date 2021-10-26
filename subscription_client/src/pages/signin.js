import React from "react";
import { Header, Slider } from "../components";
import { LogIn } from "../containers";

const signin = () => {
  return (
    <React.Fragment>
      <Header />
      <Slider />
      <LogIn />
    </React.Fragment>
  );
};

export default signin;
