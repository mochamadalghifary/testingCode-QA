import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarBookingAutomation {

    public static void main(String[] args) {
        // Setel path ke lokasi chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Inisialisasi Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Buka situs web
            driver.get("URL_situs_web");

            // Pilih Produk Mobil
            WebElement tombolProdukMobil = driver.findElement(By.xpath("//button[text()='Cars Product']"));
            tombolProdukMobil.click();

            // Pilih tab Tanpa Sopir
            WebElement tabTanpaSopir = driver.findElement(By.xpath("//button[text()='Without Driver']"));
            tabTanpaSopir.click();

            // Pilih Lokasi Penjemputan (contoh: Jakarta)
            WebElement inputLokasiPenjemputan = driver.findElement(By.id("pickup_location"));
            inputLokasiPenjemputan.sendKeys("Jakarta");

            // Pilih Tanggal & Waktu Penjemputan
            WebElement inputTanggalWaktuPenjemputan = driver.findElement(By.id("pickup_date_time"));
            inputTanggalWaktuPenjemputan.sendKeys("today+2d 09:00");

            // Pilih Tanggal & Waktu Pengembalian
            WebElement inputTanggalWaktuPengembalian = driver.findElement(By.id("drop_off_date_time"));
            inputTanggalWaktuPengembalian.sendKeys("today+5d 11:00");

            // Klik tombol Cari Mobil
            WebElement tombolCariMobil = driver.findElement(By.id("search_car_button"));
            tombolCariMobil.click();


            // Klik tombol Lanjut di Detail Produk
            WebElement tombolLanjut = driver.findElement(By.xpath("//button[text()='Continue']"));
            tombolLanjut.click();

            // Pilih Lokasi Penjemputan di "Kantor Rental"
            WebElement lokasiPenjemputanKantorRental = driver.findElement(By.xpath("//select[@id='pickup_location']/option[text()='Rental Office']"));
            lokasiPenjemputanKantorRental.click();

            // Pilih Lokasi Pengembalian di "Lokasi Lain"
            WebElement lokasiPengembalianLokasiLain = driver.findElement(By.xpath("//select[@id='drop_off_location']/option[text()='Other Location']"));
            lokasiPengembalianLokasiLain.click();


            // Klik tombol Pesan Sekarang
            WebElement tombolPesanSekarang = driver.findElement(By.id("book_now_button"));
            tombolPesanSekarang.click();


            // Klik Lanjut
            tombolLanjut = driver.findElement(By.xpath("//button[text()='Continue']"));
            tombolLanjut.click();


            // Klik Lanjut
            tombolLanjut = driver.findElement(By.xpath("//button[text()='Continue']"));
            tombolLanjut.click();

            // Pilih metode pembayaran dan lanjutkan pembayaran
            // (Tambahkan tindakan spesifik berdasarkan struktur situs web Anda)

        } finally {
            // Tutup browser
            driver.quit();
        }
    }
}
