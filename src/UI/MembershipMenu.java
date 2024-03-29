package UI;

import BookingBuilder.Booking;
import Managers.BookingManager;
import Managers.FlightManager;
import DB.CouponDBController;
import DB.MembershipDBController;
import Flights.Airline;
import Interfaces.I_Booking;
import Interfaces.I_Flight;
import Interfaces.I_Membership;
import Memento.CareTaker;
import Memento.Originator;
import Strategy.BronzePointsMultiplier;
import Strategy.GoldPointsMultiplier;
import Strategy.Points;
import Strategy.SilverPointsMultiplier;
import Strategy.StandardPointsMultiplier;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import Users.Customer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class MembershipMenu extends javax.swing.JFrame {

     private Customer cust;
     private Booking booking;
     private Originator origin;
     private CareTaker care;
     private int row;
     ArrayList<Airline> flightList;
     
    public MembershipMenu(Customer cust, Booking booking, Originator org, CareTaker care, ArrayList<Airline> flightList, int selectedRow) throws Exception {
        super();
	this.cust = cust;
	this.booking = booking;
        this.origin = org;
        this.care = care;
        this.flightList = flightList;
        this.row = selectedRow;
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws Exception {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_yourPoints = new javax.swing.JLabel();
        jLabel_bookPoints = new javax.swing.JLabel();
        jLabel_discount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_coupon = new javax.swing.JTextField();
        jButton_applyCoupon = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jButton_points = new javax.swing.JButton();
        jButton_discount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(580, 300, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Your Points:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Earned Points:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Or new Price:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Coupon:");
        
        
        jLabel_yourPoints.setText(String.valueOf(cust.getPoints()));
	jLabel_bookPoints.setText(String.valueOf(calculatePoints(booking)));
	jLabel_discount.setText(String.valueOf(calculateDiscount(cust, booking)));
                
        jButton_applyCoupon.setText("Apply");
        jButton_applyCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_applyCouponActionPerformed(evt);
            }
        });

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_points.setText("Points");
        jButton_points.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pointsActionPerformed(evt);
            }
        });

        jButton_discount.setText("Discount");
        jButton_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_discountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_yourPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_bookPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_discount, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_points)
                                .addGap(88, 88, 88)
                                .addComponent(jButton_discount))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jTextField_coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jButton_applyCoupon)))
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton_cancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_yourPoints))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_bookPoints))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_discount))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_applyCoupon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel)
                    .addComponent(jButton_points)
                    .addComponent(jButton_discount))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>

    private void jButton_applyCouponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_applyCouponActionPerformed
        
        String coupon = jTextField_coupon.getText();
        boolean couponValid = false;
        int couponPoint = 0 ;
        int Id = 0;
        
        CouponDBController couponController = new CouponDBController();
        
            
        try {
            Id = couponController.checkUserApplied(coupon);
        } catch (Exception ex) {
            Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        if(this.cust.getUserID() == Id){
             JOptionPane optionPane = new JOptionPane("You can't use the coupon you Generated!", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Failure");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        else{
            try {
                couponValid = couponController.checkCouponValid(coupon, this.cust.getUserID());
                if(!couponValid){
                    JOptionPane optionPane = new JOptionPane("Coupon is not Valid!", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else{
                    
                    try {
                        couponPoint = couponController.couponOnPurchase(coupon, Integer.parseInt(jLabel_bookPoints.getText()));
                        
                        
                        //jLabel_yourPoints.setText(String.valueOf(cust.getMembership().getPoints()));
                        jLabel_bookPoints.setText(String.valueOf(couponPoint));
                        //jLabel_discount.setText(String.valueOf(calculateDiscount(cust, booking)));
                        
                        JOptionPane optionPane = new JOptionPane("Coupon Applied", JOptionPane.INFORMATION_MESSAGE);
                        JDialog dialog = optionPane.createDialog("Successful");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    } catch (Exception ex) {
                        Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            } catch (ParseException ex) {
                Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton_applyCouponActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
       
            this.dispose();
            BookingMenu bookingMenu = null;
            try {
                    bookingMenu = new BookingMenu(cust, this.flightList, this.row, this.origin, this.care);
            } catch (Exception ex) {
                    Logger.getLogger(BookingMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            bookingMenu.setVisible(true);
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_pointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pointsActionPerformed
                
            int points = Integer.parseInt(String.valueOf(jLabel_bookPoints.getText()));
            I_Flight flightManager = new FlightManager();
            I_Booking bookingManager = new BookingManager();

            
            try {
                cust.addPoints(points, cust.getUserID());
            } catch (Exception ex) {
                Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                    bookingManager.insertBooking(booking);
                    flightManager.decreaseSeats(booking.getFlight(), booking.getClassType());
            } catch (Exception ex) {
                    Logger.getLogger(BookingMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

        try {
            displayMessage();
        } catch (Exception ex) {
            Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

            this.setVisible(false);
    }//GEN-LAST:event_jButton_pointsActionPerformed

    private void jButton_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_discountActionPerformed
        
        
            float discount = Float.parseFloat(String.valueOf( jLabel_discount.getText()));
		I_Flight flightManager = new FlightManager();

		I_Booking bookingManager = new BookingManager();
		bookingManager.changePrice(booking, discount);

		;
        try {
            cust.subtractPoints(cust.getPoints(), cust.getUserID());
        } catch (Exception ex) {
            Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

		try {
			bookingManager.insertBooking(booking);
			flightManager.decreaseSeats(booking.getFlight(), booking.getClassType());
		} catch (Exception ex) {
			Logger.getLogger(BookingMenu.class.getName()).log(Level.SEVERE, null, ex);
		}

        try {
            displayMessage();
        } catch (Exception ex) {
            Logger.getLogger(MembershipMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

		this.setVisible(false);
    }//GEN-LAST:event_jButton_discountActionPerformed
    
    public int calculatePoints(Booking booking) throws Exception {
                
            MembershipDBController db = new MembershipDBController();
            Date bookingDate = booking.getBookingDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String stringBookingDate = dateFormat.format(bookingDate);
            int points = db.calculatePoints(booking.getPrice(), booking.getFlight().getFlight().getFlightID(), stringBookingDate);
            int finalPoints = getMultiplier(points);
            
            return finalPoints;

	}
    
     
    public int getMultiplier(int finalPoints) throws Exception {
            String level = "";
            int userID = cust.getUserID();
            int points = 0;
            MembershipDBController mdb = new MembershipDBController();
            level = mdb.userLevel(userID);
            //System.out.println(level);
            
            Points ctx = new Points();
            if(level.matches("GOLD"))
            {
                 ctx.setPointsMultiplierStrategy(new GoldPointsMultiplier());
                 points = ctx.FindCalculatePoints(finalPoints);
            }else if(level.matches("SILVER")){
                ctx.setPointsMultiplierStrategy(new SilverPointsMultiplier());
                points = ctx.FindCalculatePoints(finalPoints);
            }
            else if(level.matches("BRONZE")){
                ctx.setPointsMultiplierStrategy(new BronzePointsMultiplier());
                points = ctx.FindCalculatePoints(finalPoints);
            }
            
            else if(level.matches("STANDARD")){
                ctx.setPointsMultiplierStrategy(new StandardPointsMultiplier());
                points = ctx.FindCalculatePoints(finalPoints);
            }
            
            return points;
        }
    
    
    public float calculateDiscount(Customer customer, Booking booking) {

		int points = customer.getPoints();
		float price = (float) (booking.getPrice() - 0.015*points);

		return price;

	}
    
    public void displayMessage() throws Exception {

		JOptionPane optionPane = new JOptionPane("Your purchase it's been completed", JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = optionPane.createDialog("Thanks");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);

		UserMenu u = new UserMenu(cust);
		u.setVisible(true);

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_applyCoupon;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_discount;
    private javax.swing.JButton jButton_points;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_bookPoints;
    private javax.swing.JLabel jLabel_discount;
    private javax.swing.JLabel jLabel_yourPoints;
    private javax.swing.JTextField jTextField_coupon;
    // End of variables declaration//GEN-END:variables
}
