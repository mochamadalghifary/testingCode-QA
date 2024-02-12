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

            // Pilih Mobil 
            WebElement mobil = driver.findElement(By.xpath("//your-xpath-for-selecting-car"));
            mobil.click();

            // Pilih Penyedia Mobil
            WebElement penyediaMobil = driver.findElement(By.xpath("//your-xpath-for-selecting-car-provider"));
            penyediaMobil.click();

            // Klik tombol Lanjut di Detail Produk
            WebElement tombolLanjut = driver.findElement(By.xpath("//button[text()='Continue']"));
            tombolLanjut.click();

            // Pilih Lokasi Penjemputan di "Kantor Rental"
            WebElement lokasiPenjemputanKantorRental = driver.findElement(By.xpath("//select[@id='pickup_location']/option[text()='Rental Office']"));
            lokasiPenjemputanKantorRental.click();

            // Pilih Lokasi Pengembalian di "Lokasi Lain"
            WebElement lokasiPengembalianLokasiLain = driver.findElement(By.xpath("//select[@id='drop_off_location']/option[text()='Other Location']"));
            lokasiPengembalianLokasiLain.click();

            // Masukkan Catatan Penjemputan/Pengembalian (opsional)
            WebElement catatanPenjemputan = driver.findElement(By.id("pickup_notes"));
            catatanPenjemputan.sendKeys("Your pickup notes");

            WebElement catatanPengembalian = driver.findElement(By.id("dropoff_notes"));
            catatanPengembalian.sendKeys("Your drop-off notes");

            // Klik tombol Pesan Sekarang
            WebElement tombolPesanSekarang = driver.findElement(By.id("book_now_button"));
            tombolPesanSekarang.click();

             // Isi Detail Kontak 
            WebElement namaKontak = driver.findElement(By.id("contact_name"));
            namaKontak.sendKeys("Your contact name");

            WebElement emailKontak = driver.findElement(By.id("contact_email"));
            emailKontak.sendKeys("Your contact email");

            // Isi Detail Sopir (Tambahkan tindakan spesifik berdasarkan struktur situs web Anda)
            WebElement namaDriver = driver.findElement(By.id("driver_name"));
            namaDriver.sendKeys("Driver's name");

            WebElement nomorHPDriver = driver.findElement(By.id("driver_phone"));
            nomorHPDriver.sendKeys("Driver's phone number");

            // Klik Lanjut
            tombolLanjut = driver.findElement(By.xpath("//button[text()='Continue']"));
            tombolLanjut.click();

             // Tambahkan Permintaan Khusus (opsional)
            WebElement permintaanKhusus = driver.findElement(By.id("special_requests"));
            permintaanKhusus.sendKeys("Your special requests");

            // Check all rental requirements
            WebElement persyaratanSewa = driver.findElement(By.id("rental_requirements"));
            persyaratanSewa.click();

            // Klik Lanjut
            tombolLanjut = driver.findElement(By.xpath("//button[text()='Continue']"));
            tombolLanjut.click();

            // Pilih metode pembayaran dan lanjutkan pembayaran
            WebElement metodePembayaran = driver.findElement(By.id("credit_card"));
            metodePembayaran.click();
            
            // Isi rincian pembayaran (nomor kartu, tanggal kedaluwarsa, dll.)
            WebElement nomorKartu = driver.findElement(By.id("card_number"));
            nomorKartu.sendKeys("Your card number");
            
            WebElement tanggalKedaluwarsa = driver.findElement(By.id("expiry_date"));
            tanggalKedaluwarsa.sendKeys("MM/YYYY");
            
            WebElement namaPemegangKartu = driver.findElement(By.id("card_holder_name"));
            namaPemegangKartu.sendKeys("Your name as on the card");
            
            WebElement cvv = driver.findElement(By.id("cvv"));
            cvv.sendKeys("CVV");
            
            // Klik tombol Lanjutkan Pembayaran
            WebElement tombolLanjutkanPembayaran = driver.findElement(By.id("proceed_to_payment_button"));
            tombolLanjutkanPembayaran.click();
            

        } finally {
            // Tutup browser
            driver.quit();
        }
    }
}
