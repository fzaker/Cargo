package cargo.insuranceCertificate

class AvailableInsuranceCert {

    InsuranceCert insuranceCert
    AssignedInsuranceCert assignedInsuranceCert
    Double avlStart
    Double avlEnd

    //def avlCount = (insuranceCert.serialNumEnd-insuranceCert.serialNumStart+1)-(assignedInsuranceCert.serialNumEnd - assignedInsuranceCert.serialNumStart+1)

    static constraints = {
    }
}
