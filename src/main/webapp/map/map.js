function initialize() {
    var mapOptions = {
        center: new google.maps.LatLng(50, 15),
        zoom: 5
    };
    var map = new google.maps.Map(document.getElementById("map-canvas"),
        mapOptions);
}
google.maps.event.addDomListener(window, 'load', initialize);