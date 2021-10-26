import React from "react";

const Working = () => {
  return (
    <React.Fragment>
      <div className="working">
        <div className="overlay"></div>
        <div className="container">
          <div className="faq">
            <h1>FAQs </h1>

            <li>
              <a href="">What are the plans?</a>
            </li>
            <li>
              <a href="">What can I do?</a>
            </li>
            <li>
              <a href="">Can I change the plan?</a>
            </li>
            <li>
              <a href="">How can I order a magazine?</a>
            </li>
            <li>
              <a href="">top products?</a>
            </li>
            <li>
              <a href="">is there combo packs?</a>
            </li>
          </div>

          <div className="subscribe">
            <div className="subscribe-details">
              <h1>SUBSCRIBE HERE</h1>
              <div className="">
                <form>
                  <input type="text" placeholder="Your Name *" required />
                  <input type="email" placeholder="Email *" required />
                  <input type="text" placeholder="Number *" required />
                  <button>Get it Now</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </React.Fragment>
  );
};

export default Working;
