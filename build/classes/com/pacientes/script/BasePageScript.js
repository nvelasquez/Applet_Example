/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function goIn(){
    var content = document.getElementById("WelcomeDiv").style.display = 'none';
    var menu = document.getElementById("menuPacientes").style.display = 'inline';
}
function listarPacientes(){
    var content = document.getElementById("appletsDiv");
    var applet = document.createElement("applet");
    applet.setAttribute("code", "com\\pacientes\\ui\\Consulta.class");
    applet.setAttribute("width", "500");
    applet.setAttribute("height", "500");
    applet.setAttribute("vspace", "10px");
    
    content.innerHTML = '';
    content.appendChild(applet);
}
function crearPaciente(){
    var applet = document.createElement("applet");
    var content = document.getElementById("appletsDiv");
    applet.setAttribute("code", "com\\pacientes\\ui\\Mantenimiento.class");
    applet.setAttribute("width", "500");
    applet.setAttribute("height", "500");
    applet.setAttribute("vspace", "10px");
    
    content.innerHTML = '';
    content.appendChild(applet);
}