import java.io.FileNotFoundException;

public class COMReportVersion2 {
    public static void main(String[] args) throws FileNotFoundException {

        BlockSectionDA blockSectionDA = new BlockSectionDA();

        for (BlockSection blockSection: blockSectionDA.getBlockSectionList()) {
            System.out.println("\nBlock section code: " + blockSection.getBlockCode() +
                    "\nDescription: " + blockSection.getDescription() +
                    "\nAdviser: " + blockSection.getAdviser() +
                    "\nTotal Students: " + blockSection.getTotalStudents());
            blockSection.printStudent();
        }
        }
        }
