package cargo

class Airport {
    String title
    String abbreviation
    Boolean deleted
    Integer indx
    City city

    static transients = ['deleted']
    static belongsTo = [city: City]

    //static hasMany = [cities: City]

    static constraints = {
        title(blank: false)
        abbreviation(blank: false)
    }
}
