package cargo

import org.apache.commons.collections.list.LazyList
import org.apache.commons.collections.FactoryUtils

class City {
    String title
    String persianTitle
    //Country country
    Boolean port
    String abbreviation

    //static belongsTo = [country : Country]

    static hasMany = [airports: Airport]
    static composites = ["airports"]
    List airports = LazyList.decorate(new ArrayList(), FactoryUtils.instantiateFactory(Airport.class))
    static mapping = {
        airports cascade: "all-delete-orphan"
    }

    static constraints = {
        title(blank: false, maxSize: 50)
        persianTitle(blank: false, maxSize: 50)
        port(nullable: false)
        abbreviation(blank: false)
    }
}
