import React from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";

import {
  Home,
  SignIn,
  SignUp,
  Genre,
  ContactUs,
  Featured,
  Subscription,
} from "./pages";
import * as ROUTES from "./constants/routes";

const App = () => {
  return (
    <Router>
      <Route exact path={ROUTES.HOME}>
        <Home />
      </Route>

      <Route exact path={ROUTES.SIGN_IN}>
        <SignIn />
      </Route>

      <Route exact path={ROUTES.SIGN_UP}>
        <SignUp />
      </Route>

      <Route exact path={ROUTES.GENRE}>
        <Genre />
      </Route>

      <Route exact path={ROUTES.CONTACT_US}>
        <ContactUs />
      </Route>

      <Route exact path={ROUTES.FEATURED}>
        <Featured />
      </Route>

      <Route exact path={ROUTES.SUBSCRIPTION}>
        <Subscription />
      </Route>

      {/* <Route exact path>
        <p>sorry can't find it </p>
        </Route> */}
    </Router>
  );
};

export default App;
