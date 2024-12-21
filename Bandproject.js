let slideIndex=0;
let slides= document.querySelectorAll('.myslide');

function showslides(){

    slides.forEach((slide)=>{slide.classList.remove('active');

    });

    slideIndex++;
    if(slideIndex > slides.length)slideIndex=1;
    slides[slideIndex-1].classList.add('active');

    setTimeout(showslides,4000);

}

showslides();

