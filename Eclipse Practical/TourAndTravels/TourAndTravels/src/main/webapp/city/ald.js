/**
 * 
 */
let aboutMeText = document.querySelector(".data");
const readMore = document.querySelector(".read-more");
readMore.addEventListener("click", function () {
    readMore.classList.toggle("clicked");
    if (readMore.classList.contains("clicked")) {
        aboutMeText.textContent =
            " Prayagraj, formerly known as Allahabad or Ilahabad is believed to be one of the oldest city of India and very important religious destination for Hinduism. As per the ancient sacred text of Sanatan Dharma, Prayagraj is mentioned as Prayag or Teerthraj which literally mean is king of all the teertha or pilgrimage center. Prayagraj is located on the confluence of holy river Ganga, Yamuna and Saraswati. Prayagraj is the place where Gange, Yamune and Gupt Saraswati meets which is also known as Triveni Sangam, the highly sacred place of Hinduism. This is the place where great Kumbh Mela held in every six years and Mahakumbh in every 12 years which largest as.";
        readMore.textContent = "Read Less";
    } else {
        aboutMeText.textContent =
            " Prayagraj, formerly known as Allahabad or Ilahabad is believed to be one of the oldest city of India and very important religious destination for Hinduism. As per the ancient sacred text of Sanatan Dharma, Prayagraj is mentioned as Prayag or Teerthraj which literally mean is king of all the teertha or pilgrimage center. ";
        readMore.textContent = "Read More";
    }
});