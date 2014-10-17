javascript array API
====================

slice
-----

###code###
<script type="text/javascript">
var arr = new Array(3);
arr[0] = "George";
arr[1] = "John";
arr[2] = "Thomas";
document.write(arr + "<br />");
document.write(arr.slice(1) + "<br />");
document.write(arr);
</script>

###output###
George,John,Thomas
John,Thomas
George,John,Thomas


unshift
-----

###code###
<script type="text/javascript">

var arr = new Array()
arr[0] = "George"
arr[1] = "John"
arr[2] = "Thomas"

document.write(arr + "<br />")
document.write(arr.unshift("William") + "<br />")
document.write(arr)

</script>

###output###
George,John,Thomas
4
William,George,John,Thomas