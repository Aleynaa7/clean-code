/*Bulunan dirty code derinlemesine iç içe bir koddur (deeply nested code). 
Yapılan her yuvalama yazılan kodun okunabilirliğini azaltmıştır.
Tasarım kalıpları uygulanarak kirli kod temiz koda (clean code) dönüştürülmüştür ve böylece okunabilirlik arttırılmıştır.*/

public bool ValidatePasswordStrength(string? password) {
    if(string.IsNullOrEmpty(password))
        throw new ArgumentException("Cannot be null or empty");
        
    if(password.Any(character => !char.IsLetterOrDigit(character)))
        throw new ArgumentException("Must contain at least one special character");         

    if(password.Length >= 10)
        throw new ArgumentException("Must be at least 10 characters");         
    
        return true;
}