package cargo

class Airport {
    String title
    String abbreviation
    City city

    static belongsTo = [city: City]

    static constraints = {
        city(nullable: false)
        title(blank: false)
        abbreviation(blank: false)
    }
}
