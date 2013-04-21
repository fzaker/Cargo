package cargo.insuranceCertificate

import cargo.LocalAgent


class AssignedInsuranceCert extends Insurance   {

    LocalAgent agent
    Date sendingDate


    static constraints = {

        agent(nullable: false)
        sendingDate(nullable: false)

    }


}
