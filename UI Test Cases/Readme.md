# Senaryo 2 Automation-Test
#### 6 önerilen case arasından seçilen 3 case;
- https://www.mizu.com/login sayfasında kullanıcı adı ve şifre başarılı şekilde sign in olunması.
- https://www.mizu.com/flowers ‘da aşağı scroll yaptıkça ilk 10 sayfa için her sayfada 60 ürün geldiğinin kontrolü.
- https://www.mizu.com/flowers sayfasında gönderim yeri ‘mexico city’ seçilerek ilk ürün sepete eklenir ve ilgili adımlar(sepetim, teslimat adresi,fatura bilgileri) tamamlanarak ‘Oxxo’ ile ödeme alınması kontrol edilir.


#### Kullanılan Teknolojiler;
- Java (1.8),
- Page Object Model,
- Selenium (3.141.59),
- Junit(4.13.2),
- Chrome Browser

## Projeyi Nasıl Çalıştıabilirim?
- Öncelikle Java(Örneğin Java 1.8) bizde yüklü olmalı ve bu repostoriyi bilgisayarımıza `git clone https://github.com/bekiraycibin/ciceksepeti-test-scenarios.git` komutu ile clone lamalıyız.
- Ardından Api-test klasörünü kullandığımız İDE üzerinden açmalıyız. Kullandığımız İDE bağımlılıkları yüklemek için öneri sunacaktır, onları yüklemeliyiz. Eğer önerileri yakalayamadıysak İntellij'de `pom.xml` dosyasına gelip sağ tıklayıp `Maven > Reload Project ` diyerek bağımlılıkları kendiniz yükleyebilsiniz.
- Bağımlılıklar yüklendikten sonra `src > test > java > tests` dizinin altında bulunan dosyalardan birisini açtığınızda fonksiyonların yanında yeşil play butonu çıkacaktır. Bu buton ile istenilen fonksiyonu yada class'ı çalıştırabilirsiniz.
