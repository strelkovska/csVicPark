function toggletext(domobj) {
	if ($(domobj).text() == 'Show') $(domobj).text('Hide');
	else $(domobj).text('Show');
}
$(document).ready(function() {
	$('#main').corner('round top 10px');
	$('.round').corner('round 10px');
	$('.roundtop').corner('round top 10px');
	$('.roundbottom').corner('round bottom 10px');
});