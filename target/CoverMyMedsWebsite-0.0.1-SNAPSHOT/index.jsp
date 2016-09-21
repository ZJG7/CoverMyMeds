<script type="text/javascript" src='js/jquery.min.js'></script>
<script type='text/javascript'>
$(document).ready(function()
{
$.ajax
({
type: "GET",
url: "GetMessages",
dataType:"json",
success: function(data)
{
if(data.Messages.length)
{
$.each(data.Messages, function(i,data)
{
var msg_data="<div id='msg"+data.msg_id+"'>"+data.message+"</div>";
$(msg_data).appendTo("#content");
});
}
else
{
$("#content").html("No Results");
}
}
});
$('#UpdateButton').click(function() 
{
var MSG = $("#Message").val();
var dataString = 'message='+ MSG;
$.ajax({
type: "POST",
url: "InsertMessage",
data: dataString,
cache: false,
success: function(data)
{
$("#Message").val('');
$("#content").prepend(data);
$("#Message").focus();
}
});
return false;
});
});
</script>
//HTML Code
<textarea id='Message'></textarea><br/>
<input type='button' value=' Update ' id='UpdateButton'/>
<div id='content'></div>