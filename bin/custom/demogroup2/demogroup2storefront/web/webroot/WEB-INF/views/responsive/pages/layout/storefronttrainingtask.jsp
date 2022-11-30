<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<template:page pageTitle="${pageTitle}">

<div class="price_engine_page">
   <div class="row step-section">
       <cms:pageSlot position="Section1-stepPriceEngine" var="feature">
           <cms:component component="${feature}" element="div" class="step-price-engine"/>
       </cms:pageSlot>
   </div>

   <div class="container">

       <div class="main-section col-lg-12">
           <div class="row left-side">
               <cms:pageSlot position="Section1" var="feature">
                   <cms:component component="${feature}" element="div" class="side-form"/>
               </cms:pageSlot>
           </div>

           <div class="row right-side">
               <cms:pageSlot position="Section2" var="feature">
                   <cms:component component="${feature}" element="div" class="main-content"/>
               </cms:pageSlot>
           </div>
       </div>

       <div class="main-section col-lg-12">
          <div class="row left-side">
              <cms:pageSlot position="Section3" var="feature">
                  <cms:component component="${feature}" element="div" class="side-form"/>
              </cms:pageSlot>
          </div>

          <div class="row right-side">
              <cms:pageSlot position="Section4" var="feature">
                  <cms:component component="${feature}" element="div" class="main-content"/>
              </cms:pageSlot>
          </div>
      </div>

      <div class="row right-side">
        <cms:pageSlot position="Section5" var="feature">
            <cms:component component="${feature}" element="div" class="main-content"/>
        </cms:pageSlot>
     </div>
   </div>
</div>
</template:page>

