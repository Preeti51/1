import React, { useState, useEffect } from "react";

import courses from "../../assets/images/icon-courses.png";
import teacher from "../../assets/images/icon-teacher.png";
import student from "../../assets/images/icon-student.png";
import publication from "../../assets/images/icon-publication.png";

/*
<script>
        const counters = document.querySelectorAll('.counter');
        const speed = 200; // The lower the slower
        
       window.onload=function(){
           setTimeout(function(){
            counters.forEach(counter => {
            const updateCount = () => {
                const target = +counter.getAttribute('data-target');
                const count = +counter.innerText;

                const inc = target / speed;
        
                
        
            
                if (count < target) {
                   
                    counter.innerText = count + inc;
                    
                    setTimeout(updateCount, 5);
                } else {
                    counter.innerText = target;
                }
            };
        
            updateCount();
        });
        
           },2000)
       }
        </script>
*/

const Counter = () => {
  let c1 = useState(1000);
  let c2 = useState(2000);
  let c3 = useState(3000);
  let c4 = useState(4000);

  useEffect(() => {}, []);

  return (
    <React.Fragment>
      <div className="counters">
        <div className="container">
          <div className="row">
            <div className="list">
              <div className="part">
                <div className="encloser-1">
                  <div className="icon">
                    <i>
                      <img src={courses} alt="" />
                    </i>
                  </div>
                  <div className="counter" data-target="600">
                    {c1}
                  </div>
                  <h3>Languages</h3>
                </div>
              </div>
              <div className="part">
                <div className="encloser-2">
                  <div className="icon">
                    <i>
                      <img src={teacher} alt="" />
                    </i>
                  </div>
                  <div className="counter" data-target="15000">
                    {c2}
                  </div>
                  <h3>Genres</h3>
                </div>
              </div>
              <div className="part">
                <div className="encloser-3">
                  <div className="icon">
                    <i>
                      <img src={student} alt="" />
                    </i>
                  </div>
                  <div className="counter" data-target="90000">
                    {c3}
                  </div>
                  <h3>Subscribers</h3>
                </div>
              </div>
              <div className="part">
                <div className="encloser-4">
                  <div className="icon">
                    <i>
                      <img src={publication} alt="" />
                    </i>
                  </div>
                  <div className="counter" data-target="500">
                    {c4}
                  </div>
                  <h3>Publications</h3>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </React.Fragment>
  );
};

export default Counter;
