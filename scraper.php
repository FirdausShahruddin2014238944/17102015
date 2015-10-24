<?php
$url = 'http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html';
$output = file_get_contents($url);
echo $output;
?>
