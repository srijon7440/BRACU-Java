public class fext3 {
    public static void main(String[] args) {
        boolean valid = false;
        int count = 0;
        String[] em = {"cse110@gmail.com", "government@cv.", "eee@bracu.ac.bd"};

        for (int i = 0; i < em.length; i++) {
            valid = true; // ✅ Assume valid first

            // ✅ First character and last character checks
            if (em[i].charAt(0) < 'a' || em[i].charAt(0) > 'z' ||
                em[i].charAt(em[i].length() - 1) == '.' ||
                em[i].charAt(em[i].length() - 1) == '@') {
                valid = false;
            }

            // ✅ Only check further if above passed
            if (valid) {
                for (int j = 1; j < em[i].length() - 1; j++) { // avoid index out of bounds
                    if (em[i].charAt(j) == '@') {
                        if (!((em[i].charAt(j - 1) >= 'a' && em[i].charAt(j - 1) <= 'z') ||
                              (em[i].charAt(j - 1) >= '0' && em[i].charAt(j - 1) <= '9')) ||
                            !(em[i].charAt(j + 1) >= 'a' && em[i].charAt(j + 1) <= 'z')) {
                            valid = false;
                            break;
                        }
                    } else if (em[i].charAt(j) == '.') {
                        if (!(em[i].charAt(j - 1) >= 'a' && em[i].charAt(j - 1) <= 'z') ||
                            !(em[i].charAt(j + 1) >= 'a' && em[i].charAt(j + 1) <= 'z')) {
                            valid = false;
                            break;
                        }
                    }
                }
            }

            if (valid) count++;
        }

        System.out.println(count);
    }
}
