var tabButtons=document.querySelectorAll(".tabContainer .buttonContainer button");
var tabPanels=document.querySelectorAll(".tabContainer .tabPanel");

function showPanel(panelIndex) 
{
    tabButtons.forEach(function (node)
    {
        node.style.backgroundColor="";
        node.style.color="";
    });
    tabButtons[panelIndex].style.backgroundColor="blue";
    tabButtons[panelIndex].style.color="white";
}