package cargo

class User {

    transient springSecurityService

    String username
    String password
    String email
    String mobile
    String level
    String department
    boolean enabled
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    static constraints = {
        username blank: false, unique: true
        password blank: false
        level(blank: false,inList: ["head","staff"])
        department(blank: true,inList:["Management","Data Entry","Transit","Cargo","sail","Finance","Secretariat","Public Relations"])

    }

    static mapping = {
        password column: '`password`'
    }

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this).collect { it.role } as Set
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService.encodePassword(password)
    }

    String toString(){"$username"}
}


