package cargo.insuranceCertificate

import cargo.LocalAgent


class AssignedInsuranceCert extends InsuranceCert   {

    LocalAgent agent
    Date sendingDate


    static constraints = {

        agent(nullable: true)
        sendingDate(nullable: true)


    }


}
