import React from "react";

import "./header.css";

import logo from "../../assets/images/menu-logo.png";

export default function Header() {
  return (
    <React.Fragment>
      <div className="header">
        <div className="top-bar">
          <div className="container">
            <ul>
              <ol>
                <a href="">DELHI,INDIA</a>
              </ol>
            </ul>
          </div>

          <div className="part-2">
            <ul>
              <ol>
                <a href="callto:(+91) 911 375 1016">
                  <span className="call"></span>(+91) 911 375 1016
                </a>
              </ol>
              <ol>
                <a href="mailto:pratyayamrit1979@gmail.com">
                  <span className="email"></span> the.reader@gmail.com
                </a>
              </ol>
              <ol>
                <a href="./loginpage.html">
                  <span className="login"></span>
                  Login/Register
                </a>
              </ol>
            </ul>
          </div>
        </div>
      </div>

      <div className="menu">
        <div className="container">
          <div className="part-1">
            <div className="logo">
              <div className="logo-1">
                {" "}
                <a href="./home.html">
                  <img src={logo} alt="companyLogo" />
                </a>
              </div>

              <div className="logo-2">
                <a href="./home.html">
                  {" "}
                  <img src="" alt="" />
                </a>
              </div>
            </div>
          </div>
          <div className="part-2">
            <ul>
              <ol>
                <a href="./genres.html">
                  Genres <i className=""></i>
                </a>
                <ul className="sub-menu-1">
                  <li>
                    <a href="">Sports</a>
                  </li>
                  <li>
                    <a href="">Fashion</a>
                  </li>
                  <li>
                    <a href="">Technology</a>
                  </li>
                  <li>
                    <a href="">Buisness</a>
                  </li>
                  <li>
                    <a href="">Real Estate</a>
                  </li>
                </ul>
              </ol>

              <ol>
                <a href="./offers.html">
                  Offers <i className=""></i>
                </a>
                <ul className="sub-menu-3">
                  <li>
                    <a href=""> Free !</a>
                  </li>
                  <li>
                    <a href="">Under 200</a>
                  </li>
                  <li>
                    <a href="">Him/Her Combo</a>
                  </li>
                </ul>
              </ol>

              <ol>
                <a href="./subscriptions.html">
                  Shop <i className=""></i>
                </a>
                <ul className="sub-menu-5">
                  <li>
                    <a href="">Yearly Subscription</a>
                  </li>
                  <li>
                    <a href="">Quarterly Subscription</a>
                  </li>
                  <li>
                    <a href="">Monthly Subscription</a>
                  </li>
                </ul>
              </ol>
              <ol>
                <a href="./featured.html">
                  Featured <i className=""></i>
                </a>
                <ul className="sub-menu-6">
                  <li>
                    <a href="">Best Sellers</a>
                  </li>
                  <li>
                    <a href="">Top Picks</a>
                  </li>
                  <li>
                    <a href="">Helping Hand</a>
                  </li>
                </ul>
              </ol>
              <ol>
                <a href="./contactus.html">Contact Us</a>
              </ol>

              <ol>
                <a href="https://www.google.co.in/">
                  <button>
                    <span className="magnify"></span>
                  </button>
                </a>
              </ol>
            </ul>
          </div>
        </div>

        <div className="hamburger">
          <button>
            <span className="nav">
              <ul>
                <ol>
                  <a href="./genres.html">GENRES</a>
                </ol>
                <ol>
                  <a href="">OFFERS</a>
                </ol>
                <ol>
                  <a href="./subscriptions.html">SHOP</a>
                </ol>
                <ol>
                  <a href="./featured.html">FEATURED</a>
                </ol>
                <ol>
                  <a href="./contactus.html">CONTACT US</a>
                </ol>
              </ul>
            </span>
          </button>
        </div>
      </div>
    </React.Fragment>
  );
}
