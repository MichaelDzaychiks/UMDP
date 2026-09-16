fetch("https://data.bmkg.go.id/DataMKG/TEWS/gempadirasakan.json")
    .then(response => response.json())
    .then(data => {
        console.log(data);
        console.log(data.Infogempa.gempa)

        //foreach
        data.Infogempa.gempa.forEach(element => {
            document.getElementById("data-gempa").
                innerHTML +=
                ` ${element.Tanggal} <br>
            ${element.Wilayah} <hr>`
        });

    })

fetch("https://data.bmkg.go.id/DataMKG/TEWS/autogempa.json")
    .then(response => response.json())
    .then(data => {
        console.log(data);

        document.getElementById("gempa-terbaru").innerHTML =`
            <img src="https://static.bmkg.go.id/${data.Infogempa.gempa.Shakemap}" width="200px" ></img><br>
            ${data.Infogempa.gempa.Tanggal} <br> 
            ${data.Infogempa.gempa.Wilayah}`


    })