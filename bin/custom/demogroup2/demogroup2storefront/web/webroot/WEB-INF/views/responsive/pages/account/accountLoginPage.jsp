<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<style>
    .hidden{
        display:none;
    }

    .switch-container{
        display:flex;
        justify-content:center;
    }

    .login-container{
        display:flex;
        width:100%;
        justify-content:center;
    }

    .daftar-button{
        border-radius:2em;
        height:2.5em;
        font-size:1.2em;
        width:100%
    }


</style>


<template:page pageTitle="${pageTitle}">
	<div class="account-container">

		<div id="login" class="login-container">
		    <cms:pageSlot position="LeftContentSlot" var="feature" element="div" class="login-left-content-slot">
            	<cms:component component="${feature}"  element="div" class="login-left-content-component"/>
            	 <button class="daftar-button" onclick="daftar()"> DAFTAR </button>
            </cms:pageSlot>
		</div>

		<div id="daftar" class="login-container hidden">
            <cms:pageSlot position="RightContentSlot" var="feature" element="div" class="login-right-content-slot">
                <cms:component component="${feature}"  element="div" class="login-right-content-component"/>
                 <button class="daftar-button" onclick="login()"> LOGIN </button>
            </cms:pageSlot>

        </div>
	</div>

	<script>
        const getLogin = document.getElementById("login")
        const getDaftar= document.getElementById("daftar")

        function daftar() {
            getDaftar.classList.toggle("hidden")
            getLogin.classList.add("hidden")
        }

        function login() {
            getLogin.classList.remove("hidden")
            getDaftar.classList.add("hidden")
        }
	</script>


</template:page>