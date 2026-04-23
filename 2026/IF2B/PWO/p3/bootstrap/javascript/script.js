console.log("pesan ini tampil di console browser");
// ugly ass button
alert("selamat datang");

document.getElementById("nama").innerHTML = "nama saya Michael";

let pesan = "belajar javascript menyenangkan";
document.getElementById("pesan").innerHTML = "ini pesan";

// Array
let kompetensi = ["fullstack", "project manager","UI/UX"];
document.getElementById("kompetensi").innerHTML = kompetensi[2];

kompetensi.forEach(element => {
    document.getElementById("kompetensi").innerHTML += `<li> ${element} </li>`;
    // getElementById("kompetensi").innerHTML += "<li>" + element + "</li>";
});