package bndtools.api;

public enum EE {

    OSGI_Minumum_1_0 ("OSGi/Minimum-1.0"),
    OSGI_Minumum_1_1 ("OSGi/Minimum-1.1", OSGI_Minumum_1_0),
    OSGI_Minumum_1_2 ("OSGi/Minimum-1.2", OSGI_Minumum_1_0, OSGI_Minumum_1_1),

    JRE_1_1 ("JRE-1.1"),
    J2SE_1_2 ("J2SE-1.2", JRE_1_1),
    J2SE_1_3 ("J2SE-1.3", JRE_1_1, J2SE_1_2, OSGI_Minumum_1_0, OSGI_Minumum_1_1),
    J2SE_1_4 ("J2SE-1.4", JRE_1_1, J2SE_1_2, J2SE_1_3, OSGI_Minumum_1_0, OSGI_Minumum_1_1, OSGI_Minumum_1_2),
    J2SE_1_5 ("J2SE-1.5", JRE_1_1, J2SE_1_2, J2SE_1_3, J2SE_1_4, OSGI_Minumum_1_0, OSGI_Minumum_1_1, OSGI_Minumum_1_2),

    JavaSE_1_6 ("JavaSE-1.6", JRE_1_1, J2SE_1_2, J2SE_1_3, J2SE_1_4, J2SE_1_5, OSGI_Minumum_1_0, OSGI_Minumum_1_1, OSGI_Minumum_1_2),
    JavaSE_1_7 ("JavaSE-1.7", JRE_1_1, J2SE_1_2, J2SE_1_3, J2SE_1_4, J2SE_1_5, JavaSE_1_6, OSGI_Minumum_1_0, OSGI_Minumum_1_1, OSGI_Minumum_1_2);

    private final String eeName;
    private final EE[] compatible;

    EE (String name, EE... compatible) {
        eeName = name;
        this.compatible = compatible;
    }

    public String getEEName() {
        return eeName;
    }

    public EE[] getCompatible() {
        return compatible != null ? compatible : new EE[0];
    }
}