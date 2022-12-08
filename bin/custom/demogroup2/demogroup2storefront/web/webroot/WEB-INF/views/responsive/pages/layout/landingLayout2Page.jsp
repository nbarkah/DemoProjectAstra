<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">

    <div class="homepage-banner" style="background-color: yellow;">
        <cms:pageSlot position="Section1" var="feature">
            <cms:component component="${feature}" element="div" class="banner"/>
        </cms:pageSlot>
    </div>

    <div class="homepage-product-carousel" style="background-color:#6086c2;">
        <cms:pageSlot position="Section2" var="feature" element="div" class="row no-margin">
            <cms:component component="${feature}" element="div" class="col-xs-12 col-sm-6 no-space yComponentWrapper"/>
        </cms:pageSlot>
    </div>

    <div class="">
        <cms:pageSlot position="Section3" var="feature" >
            <cms:component component="${feature}" element="div" class="card-product no-space yComponentWrapper"/>
        </cms:pageSlot>
    </div>

    <div class="">
        <cms:pageSlot position="Section4" var="feature" element="div" class="row no-margin">
            <cms:component component="${feature}" element="div" class="col-xs-6 col-md-3 no-space yComponentWrapper"/>
        </cms:pageSlot>
    </div>

    <div class="">
        <cms:pageSlot position="Section5" var="feature" element="div">
            <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
        </cms:pageSlot>
    </div>

</template:page>
