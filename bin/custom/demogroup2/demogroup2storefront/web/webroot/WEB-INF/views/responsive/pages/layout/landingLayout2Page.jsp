<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
    <div class="banner-container">


    <div class="homepage-banner" style="background-color: #6086c2;">
        <cms:pageSlot position="Section1" var="feature">
            <cms:component component="${feature}" element="div" class="banner"/>
        </cms:pageSlot>
    </div>



    <div class="homepage-product-carousel" style="background-color:#6086c2;">
        <cms:pageSlot position="Section2" var="feature" element="div" class="no-margin">
            <cms:component component="${feature}" element="div" class=" no-space yComponentWrapper"/>
        </cms:pageSlot>
    </div>

    <div class="homepage-unboxing" style="background-color:#d4effc;">
        <cms:pageSlot position="Section3" var="feature" >
            <cms:component component="${feature}" element="div" class="card-product no-space yComponentWrapper"/>
        </cms:pageSlot>
    </div>

    <div class="homepage-testimoni" style="background-color:#f3f4f4">
        <cms:pageSlot position="Section4" var="feature" element="div" class="no-margin">
            <cms:component component="${feature}" element="div" class=" no-space yComponentWrapper"/>
        </cms:pageSlot>
    </div>


</template:page>
