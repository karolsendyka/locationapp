var map;

function placeMarker(location) {
    var marker = new google.maps.Marker({
        position: location,
        map: map
    });
}

function initialize() {
    var mapOptions = {
        center: new google.maps.LatLng(50, 15),
        zoom: 5
    };
    map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions);

    google.maps.event.addListener(map, 'click', function (event) {
        placeMarker(event.latLng);
    });
}
google.maps.event.addDomListener(window, 'load', initialize);