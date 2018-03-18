$("#carImage1, #carImage2, #carImage3, #carImage4, #carImage5").on("change", function() {
	let imageId = "#" + (event.target).id;
	readURL(event.target, imageId);
});

$("#carImage6, #carImage7, #carImage8, #carImage9, #carImage10").on("change", function() {
	let imageId = "#" + (event.target).id;
	readURL(event.target, imageId);
});

$(function() {
	hider();
});
function hider() {
	$(".upload_more_img").hide();
	$(".upload_more_img").first().show();
}
function readURL(input, imageId) {
	if (input.files && input.files[0]) {
		
		let reader = new FileReader();
		
		reader.addEventListener("load", function(e) {
			$(imageId).siblings().attr("src", e.target.result);
			showNext(imageId);
		});
		
		reader.readAsDataURL(input.files[0]);
	}
}
function showNext(imageId) {
	$(imageId).parent().next().show();
}